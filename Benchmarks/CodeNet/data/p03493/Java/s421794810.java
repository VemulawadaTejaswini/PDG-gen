import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int s1 = sin.nextInt();
    int s2 = sin.nextInt();
    int s3 = sin.nextInt();
    int[] s = {s1,s2,s3};
    int count = 0;
    for(int i = 0;i <= s.length;i++){
      if(s[i] == 1){
        count += 1; 
      }  
    }
    System.out.println(count);
  }  
}  