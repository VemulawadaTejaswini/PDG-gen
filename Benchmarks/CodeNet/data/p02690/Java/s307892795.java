import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int x =  sc.nextInt();
	int a = 0;
    int b = 0;

    end:
    for(int i=0;i<300;i++){
        for(int j=-300;j<300;j++){
            if(i*i*i*i*i*i - j*j*j*j*j== x){
                a=i;
                b=j;
                break end ;
            }
        }
    }
	System.out.println(a+" "+b);
  }
}