import java.util.*; 
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String s = sc.next(), t = sc.next();
 
        int l = calc(n, m);
        int x = (int)l / m;
        int y = (int)l / n;
 
        boolean bl = true;
        for(int i = 0; i * x< s.length(); i++){
            if(s.charAt(i * x) != t.charAt(i * y)){
                System.out.println(-1);
                bl = false;
                break;
            }
        } 
        if(bl)
            System.out.println(l);
 
    }
    static int calc (int n, int m)
    {
        int x = Math.min(n, m);
        int y = Math.max(n, m);
        for(int i = 1; i < x;i++)
        {
            if(y * i % x == 0){
                return y * i;
            }
        }
        return y * x;
    }
 }

