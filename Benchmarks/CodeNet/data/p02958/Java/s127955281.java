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
    int box = 0;
    Arrays.sort(x);
    int count = 0;
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
        if(count == 0){
        System.out.println("YES");
        }
        break;
    }
  }
}
