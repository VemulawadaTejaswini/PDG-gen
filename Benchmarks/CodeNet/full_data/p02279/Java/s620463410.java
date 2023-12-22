import java.util.Scanner;

class Main
{

    static int[]a = new int[100000];
    static int[]b = new int[100000];
    static int[]c = new int[100000];
    static int[]de = new int[100000];
    static int n;

    static void Depth(int a, int i)
    {
        de[a] = i;
        if(c[a] != -1) Depth(c[a],i);
        if(b[a] != -1) Depth(b[a], i + 1);
    }

    static void Print(int u)
    {
        int i,k;
        System.out.print("node " + u + ": parent = " + a[u] + " depth = " + de[u] + " ");

        if(a[u] == -1) System.out.print("root, ");
        else if(b[u] == -1) System.out.print("leaf, ");
        else System.out.print("internal node, ");

        System.out.print("[");

     for(i = 0, k = b[u]; k != -1; i++, k = c[k])
                {
                    if(i != 0)System.out.print(", ");
                    System.out.print(k);
                }
        System.out.println("]");
    }

    public static void main(String[] args)
    {
        Scanner In = new Scanner(System.in);
        int d,e,f,g,h;

        n = In.nextInt();

        for(int i = 0; i < n; i++)
            {
                a[i] = -1;
                b[i] = -1;
                c[i] = -1;
            }

        g = h = 100;

    for(int i = 0; i < n; i++)
            {
                d = In.nextInt();
                e = In.nextInt();
                for(int j = 0; j < e; j++)
                    {
                        f = In.nextInt();

                        if(j == 0)  b[d] = f;
                        else c[g] = f;
                        g = f;
                        a[f] = d;
                    }
            }

    for(int i = 0; i < n; i++)
        {
            if(a[i] == -1) h = i;
        }

    Depth(h,0);

    for(int i = 0; i < n; i++)
        Print(i);

    }
}