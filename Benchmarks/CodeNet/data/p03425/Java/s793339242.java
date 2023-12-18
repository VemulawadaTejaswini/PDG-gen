import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] y = new int[5];
        Arrays.fill(y, 0);
        for(int i = 0; i < n; i++){
            char x = sc.next().charAt(0);
            switch(x){
                case 'M': y[0]++; break;
                case 'A': y[1]++; break;
                case 'R': y[2]++; break;
                case 'C': y[3]++; break;
                case 'H': y[4]++; break;
                default: break;
            }
        }
       long ans = 0;
        for(int i = 0; i < 3; i++)
            for(int j = i+1; j < 4; j++)
                for(int k = j+1; k < 5; k++)
                    ans += y[i] * y[j] * y[k];
        System.out.println(ans);
    }
}