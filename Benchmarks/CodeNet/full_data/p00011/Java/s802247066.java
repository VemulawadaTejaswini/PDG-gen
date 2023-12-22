import java.util.Scanner;

class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] l = new int[w+1];
        for(int i=0;i<w+1;i++)
        	{
        		l[i] = i;
        	}
        for(int i=0;i<n;i++)
            {
                String[] s = sc.next().split(",");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int tmp = l[a];
                l[a] = l[b];
                l[b] = tmp;
            }

        for(int i=1;i<w+1;i++)
            {
                System.out.println(l[i]);
            }
    }
}