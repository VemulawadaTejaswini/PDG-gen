import java.util.Arrays;   
public class Main 
{ 
    static int minRadius(int k, int[] x, int[] y,  
                                          int n) 
    { 
        int[] dis=new int[n];
        for (int i = 0; i < n; i++) 
            dis[i] = x[i] * x[i] + y[i] * y[i]; 
        Arrays.sort(dis); 
        return dis[k - 1]; 
    } 
    public static void main (String[] args) { 
    int k = 3; 
    int[] x = { 1, -1, 1 }; 
    int[] y = { 1, -1, -1 }; 
    int n = x.length; 
    System.out.println(minRadius(k, x, y, n));   
    } 
}