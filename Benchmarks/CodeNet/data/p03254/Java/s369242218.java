import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int tot_happy = 0;
        int n = sb.nextInt();
        int x = sb.nextInt();
        int happy_no[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            happy_no[i] = sb.nextInt();
            }
        Arrays.sort(happy_no);
        int i=-1;
        while(x>0 && i<n){
            if((x-happy_no[++i])>0){
                x-=happy_no[i]; 
            }
            else{
                i--;
                break;
            }
        }
            System.out.print(i);
        
    }
}