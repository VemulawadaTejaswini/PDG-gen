import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] stoneArr = sc.next().toCharArray();
        int count = 0;
        for(int i=n/2; i<n; i++) {
            if(stoneArr[i] == 'R') if(stoneArr[i-1] == 'W') {
                count++;
                for(int j=0; j<n; j++) {
                    if(stoneArr[j] =='W') {
                        stoneArr[j] = 'R';
                        stoneArr[i] = 'W';
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}


