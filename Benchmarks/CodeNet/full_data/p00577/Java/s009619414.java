import java.util.Scanner;
public class Main{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            char stmp[] = new char[n];
            String str = sc.next();
            int count = 0;
            for(int i = 0 ; i < n ; i++)
                stmp[i] = str.charAt(i);
            char lastc = stmp[0];
            for(int i = 1 ; i < n ; i++)
            {
		if(i == n-1 && stmp[i] != lastc)
			count++;
                else if(stmp[i] != lastc)
                {
                    count++;
                    lastc = stmp[i+1];
                    i++;
                }
                else
                    lastc = stmp[i];
            }
            System.out.println(count);
    }
}
