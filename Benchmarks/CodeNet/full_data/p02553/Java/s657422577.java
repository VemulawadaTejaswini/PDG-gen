import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    
    int ab = a*b;
    int ac = a*c;
    int ad = a*d;
    int bc = b*c;
    int cd = c*d;
    
    int max = 0;
    
    int[] num={ab,ac,ad,bc,cd};
    for(int i= 0;i < num.length;i++){
      if(num[i]>max){
        max = num[i];
      }
    }
    System.out.println(max);
  }
}