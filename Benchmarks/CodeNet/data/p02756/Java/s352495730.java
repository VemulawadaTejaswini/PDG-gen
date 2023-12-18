import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       
		String s=sc.next();
        int n=sc.nextInt();
  		ArrayDeque<String> ad=new ArrayDeque<String>();
  		String[] an=s.split("");
  		for(int c=0;c<s.length();c++){
        	ad.add(an[c]);
        }

		for(int c=0;c<n;c++){
    		int b=sc.nextInt();
          if(b==1){
          	String d=ad.getFirst();
            String e=ad.getLast();
            ad.removeFirst();
            ad.removeLast();
            ad.addFirst(e);
            ad.addLast(d);
            
          }else{
            int f=sc.nextInt();
          	if(f==1){
             ad.addFirst(sc.next());
            }else{
             ad.addLast(sc.next());
            }
          }
    	}
  	String ans="";
    
 	for(String a:ad){
    	ans+=a;
    }
    	System.out.println(ans);
    }
}