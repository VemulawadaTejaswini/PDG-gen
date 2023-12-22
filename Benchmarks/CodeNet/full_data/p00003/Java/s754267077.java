public class Main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        doStuff(in);
    }

    public static void doStuff(Scanner in) 
    {
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            int[] vals = new int[3];
            vals[0] = in.nextInt();
            vals[1] = in.nextInt();
            vals[2] = in.nextInt();
            
            Arrays.sort(vals);
            
            boolean rightTri = ((vals[0] * vals[0]) + (vals[1] * vals[1])) == (vals[2] * vals[2]);
            
            System.out.println(rightTri ? "YES" : "NO");
        }
    }

    public static void solve() 
    {
    
    }
}