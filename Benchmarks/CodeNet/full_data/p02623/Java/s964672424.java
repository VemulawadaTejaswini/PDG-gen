import java.util.*;
class Main{
 
    public static void main(String[] args)
          {
	Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      int m =sc.nextInt();
      int k =sc.nextInt();
      ArrayList<Integer> a=new ArrayList<Integer>();
    ArrayList<Integer> b=new ArrayList<Integer>();
    for(int i=0;i<n;i++){
        a.add(sc.nextInt());      

    }
    for(int i=0;i<m;i++){
        b.add(sc.nextInt());      

    }
    int sum=0;
    int p=0;
    int q=0;
    int count=0;
    int x=0;
    while(sum<k){
      if(p<n&&q<m){
        if(a.get(p)<b.get(q))
      {
        
          x=a.get(p);
          
            p++;
    
        
      }
      else{
        x=b.get(q);
        q++;
      }
      }
      else if (p<n) {

          x=a.get(p);
          
            p++;
        
      }
      else if (q<m) {

        x=b.get(q);
        q++;
      }
      else{
        break;
      }
      
      sum+=x;
      if(sum<=k){
        count++;
      }
      

    }
    System.out.println(count);




      
      
	 
    }
}

 