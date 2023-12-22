/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wijebandara
 */
public class Main {
    public static void main(String[] args) {
        try {
            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            int n;
            int count=0;
            String s =in.readLine();
            while(s!=null)
            {
                n = Integer.parseInt(s);
                if(n<2)
                {
                    count=0;
                }
                else
                {
                    count=1;
                }
                for (int i = 3; i <=n; i+=2) {
                    if(isp(i))
                    {
                        count++;
                    }
                }
                System.out.println(count);
                s =in.readLine();
            }
            
            
        } catch (Exception ex) {
            System.exit(0);
        }
    }
    static boolean isp(int x)
    {
        int a =(int)Math.sqrt(x);
        for (int i = 2; i <=a; i++) {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}