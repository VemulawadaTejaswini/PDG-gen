import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int[] x = new int[n];
    int[] copyX = new int[n];

    for(int i = 0;i < n;i++){
      x[i] = sc.nextInt();
    }

    System.arraycopy(x,0,copyX,0,x.length);
    Arrays.sort(x);
    int box = 0;
    int count = 0;
    int fcount = 0;
    int judge = 1;
    for(int i = 0;i<n;i++){
        if(x[i] != i){
            fcount++;
            if(fcount == 3){
                judge = 2;
            }
        }
    }

    if(judge == 1){
        for(int i = 0;i < n;i++){
            if(x[i] != copyX[i]){

                for(int j = 0;j < n;j++){
                    if(copyX[j] != j+1){

                        ++count;
                        if(count == 3){
                            System.out.println("NO");
                            break;
                        }
                    }
                }
            }
        }
        if(count == 0){
            System.out.println("YES");
        }
    }else if(judge == 2){
        for(int i = 0;i < n;i++){
            if(x[i] != copyX[i]){

                for(int j = n-1;j >= 0;j--){
                    if(copyX[j] != j+1){

                        ++count;
                        if(count == 3){
                            System.out.println("NO");
                            break;
                        }
                    }
                }
            }
        }
        if(count == 0){
            System.out.println("YES");
        }
    }
  }
}
