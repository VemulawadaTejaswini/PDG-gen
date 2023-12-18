import java.util.*; 
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String s = sc.next(), t = sc.next();
 
        long l = calc(n, m);
        int x = (int)l / m;
        int y = (int)l / n;
 
        boolean bl = true;
        for(int i = 0; i * x < n; i++){
            if(s.charAt(i * x) != t.charAt(i * y)){
                System.out.println(-1);
                bl = false;
                break;
            }
        } 
        if(bl)
            System.out.println(l);
 
    }
    static long calc (int n, int m)
    {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int tmp = a;
        while(a % b != 0){
            int c = a;
            a = b;
            b = c % b;
        }
        return (long) n * m / b;
    }
 }


