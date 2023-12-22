import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] hight = new int[n];
        for (int i = 0; i < n; i++) {
            hight[i] = sc.nextInt();
        }
        
        int[] perfect = new int[n];
        for (int i = 0; i < n; i++) {
            perfect[i] = 0;
        }
        
        int[] perfect2 = new int[n];
        for (int i = 0; i < n; i++) {
            perfect2[i] = 0;
        }
        
        for (int i = 0; i < m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            perfect2[a - 1] = 1;
            perfect2[b -1] = 1;
            
            if (hight[a - 1] > hight[b - 1]) {
                perfect[a -1] = 1;
            } else if (hight[a - 1] < hight[b - 1]) {
                perfect[b - 1] = 1;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (perfect[i] != 0) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (perfect2[i] == 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
} 