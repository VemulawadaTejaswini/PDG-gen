import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int x=scan.nextInt();
    int count=0;

    for(int i=1;i<n-1;i++){
      for(int j=2;j<n;j++){
        for(int k=3;k<n-1;k++){
          if(i+j+k==x) count++;
        }
      }
    }
    System.out.println(count);
  }
}

