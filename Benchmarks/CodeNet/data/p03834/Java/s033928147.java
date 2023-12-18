import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int s=sc.nextInt();
    int ans=0;
    for(int x=0;x<k+1;x++){
      for(int y=0;x<k+1;x++){
        for(int z=0;x<k+1;x++){
			if(x+y+z==s){
              ans++;
            }
        }
      }
    }
      System.out.println(ans);
    }
  }