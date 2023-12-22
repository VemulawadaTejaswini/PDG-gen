import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1149().doIt();
    }
    class aoj1149{
    	ArrayList<Par> array = new ArrayList<Par>();
    	void ADD(int move,Par p,int l){
 			move = move % l;
 			if(move - p.w < 0){
 				Par p2 = new Par(move,p.h,move*p.h);
 				Par p3 = new Par(p.w - move,p.h,(p.w - move)*p.h);
 				if(p2.s < p3.s){
 					array.add(p2);array.add(p3);
 				}else{
 					array.add(p3);array.add(p2);
 				}
 			 }else{
 				 Par p2 = new Par(p.w,move - p.w,p.w*(move - p.w));
 				 Par p3 = new Par(p.w,p.h - move + p.w,p.w*(p.h - move + p.w));
 				if(p2.s < p3.s){
 					array.add(p2);array.add(p3);
 				}else{
 					array.add(p3);array.add(p2);
 				}
 			 }
    	}
         void doIt(){
        	 while(true){
        		 int n = sc.nextInt();
        		 int w = sc.nextInt();
        		 int h = sc.nextInt();
        		 if(n+w+h == 0)break;
        		 array.add(new Par(w,h,w*h));
        		 for(int i = 0;i < n;i++){
        			 int num = sc.nextInt();
        			 int move = sc.nextInt();
        			 Par p = array.remove(num-1);
        			 ADD(move,p,p.w + p.h);
//        			 for(int j = 0;j < array.size();j++){
//        				 System.out.println(array.get(j).w+" "+array.get(j).h+" "+array.get(j).s);
//        			 }
        		 }
        		 Collections.sort(array);
//        		 for(int j = 0;j < array.size();j++){
//    				 System.out.println(array.get(j).w+" "+array.get(j).h+" "+array.get(j).s);
//    			 }
        		 System.out.print(array.get(0).s);
        		 for(int j = 1;j < array.size();j++){
        			 System.out.print(" "+array.get(j).s);
        		 }
        		 System.out.println();
        		 array.clear();
             }
         }
         class Par implements Comparable<Par>{
             int w,h,s;
             public Par(int w,int h,int s) {
                 this.w = w;
                 this.h = h;
                 this.s = s;
             }
             public int compareTo(Par o) {
                 return this.s - o.s;
             }
         }
     }
}