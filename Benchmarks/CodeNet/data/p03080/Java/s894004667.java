import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String str=sc.nextLine();
    char c[]=str.toCharArray();
    int r=0,b=0;
    for(int i=0;i<n;i++){
      if(c[i]=='R'){
        r++;
      }else{
        b++;
      }
    }
    if(r>b){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}

