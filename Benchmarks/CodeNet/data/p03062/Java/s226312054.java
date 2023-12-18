import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int nam[] = new int [A];int nam1 = 0;
       int flag = 0;int sam = 0;
      
      for(int i=0;i<A;i++){
        nam1 = sc.nextInt();
        if(nam1<0){
          flag++;
        }
        nam[i] = Math.abs(nam1);
      }
   for(int i=0;i<A;i++){sam += nam[i];}
      if(flag%2==0){
		System.out.print(sam);
      }
      else{
      Arrays.sort(nam);
      sam = sam-nam[0]*2;
      System.out.print(sam);
      }

      
    }
}