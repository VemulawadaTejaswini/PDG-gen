import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力(N M K)
      	int N = sc.nextInt();
        int M = sc.nextInt();
      	int K = sc.nextInt();
      
      //	System.out.println(N);
      //  System.out.println(M);
      //  System.out.println(K);
        
      	List<Integer> Alist = new ArrayList<Integer>();
      	List<Integer> Blist = new ArrayList<Integer>();
      	
      	for(int i=0;i<N;i++){
         Alist.add(sc.nextInt());
        // System.out.print(Alist.get(i)+" ");
        }
      //	 System.out.println();
      
        for(int i=0;i<M;i++){
         Blist.add(sc.nextInt());
       //  System.out.print(Blist.get(i)+" ");
        }
      //	 System.out.println();
      
      int sumBook=0;//累計冊数
      int sumTime=0;//現時点の経過時間
      
      while(K>sumTime){
        
      	if((Alist == null || Alist.size()==0) && (Blist == null  || Blist.size()==0)){
       //   System.out.println("a"); 
          break;
     		
        }else if((Alist == null || Alist.size()==0) && (Blist != null  && Blist.size()!=0)){
        
            sumTime += Blist.get(0);
             sumBook ++;
             Blist.remove(0);
         //  	System.out.println("b");
          
        }else if((Alist != null && Alist.size()!=0) && (Blist == null  || Blist.size()==0)){
        
            sumTime += Alist.get(0);
             sumBook ++;
             Alist.remove(0);
       //      System.out.println("c");
           
          
        }else if((Alist != null && Alist.size()!=0) && (Blist != null  && Blist.size()!=0)){
          
       //   System.out.println("alist:"+Alist.size());
       //   System.out.println("blist:"+Blist.size());
          
          if((Alist.get(0) >= Blist.get(0))){
          
             sumTime += Blist.get(0);
             sumBook ++;
             Blist.remove(0);
        //   	System.out.println("b");
        
          }else if( (Alist.get(0) < Blist.get(0))){
           
            sumTime += Alist.get(0);
             sumBook ++;
             Alist.remove(0);
        //     System.out.println("c");
           }
     	 }
    //  System.out.println("sumTime="+sumTime);
        //    System.out.println("K="+K);
      }
    
      	if(K==sumTime){
          System.out.println(sumBook);
        }else{
          System.out.println(sumBook-1);
        }
        
	}
}