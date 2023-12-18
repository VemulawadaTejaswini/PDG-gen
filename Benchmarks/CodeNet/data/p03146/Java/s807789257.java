import java.util.*;

class Main{
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int flag = 0;
    int[] a = new int[10000000];
	int answer = 1;
    while(flag == 0){
      if(s%2 == 0){
        s = s/2;
      }else{
        s = s*3+1;
      }
      a[s]++;
	  answer++;
      if(a[s] == 2){
        flag = 1;
      }
    }
    System.out.print(answer);
  }
}
