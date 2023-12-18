import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    long K=s.nextInt();
    int[] List=new int[N];
    for(int i=0;i<N;i++) List[i]=s.nextInt();
    int townNum=1;
	for(int i=0;i<K;i++){
      townNum=List[townNum-1];
    }
    System.out.println(townNum);
  }  
}