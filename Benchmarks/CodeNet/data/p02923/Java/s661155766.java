import java.util.Scanner;
 
class Main {

  public static void main(String Args[]) {

    int n = a.nextInt();
    int array[] = new int[n];
    int max =0;
    int pre = in.nextInt();
    int currcount=0;
    for(int i =1;i<n;i++) {
      int val =in.nextInt();
      if(val<=pre)
      {
        currcount++;
      }
      else
      {
        if(max<currcount)
          max = currcount;
        currcount=0;
      }
      pre =val;
    }
  	if(max<currcount){
        max = currcount;
  	}
    System.out.println(max);
  }
}