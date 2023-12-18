import java.util.*;
class Main
{
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int n = str.length();
        int m = str1.length();
        int res[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            res[i][0]=0;
        }
        for(int i=0;i<=m;i++)
        {
            res[0][i]=0;
        }
        String rest="";
        int max = -1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(str.charAt(i-1)!=str1.charAt(j-1))
                {
                    res[i][j]=Math.max(res[i-1][j],res[i][j-1]);
                }
                else
                {
                    res[i][j]=res[i-1][j-1]+1;
                    if(res[i][j]>max)
                    {
                        rest = rest+Character.toString(str.charAt(i-1));
                        max = res[i][j];
                        // System.out.println(rest);
                    }
                }
            }
        }
        int index = res[n][m]; 
        int temp = index; 
   
        // Create a character array to store the lcs string 
        char[] lcs = new char[index+1]; 
        lcs[index] = '\u0000'; // Set the terminating character 
   
        // Start from the right-most-bottom-most corner and 
        // one by one store characters in lcs[] 
        int i = n; 
        int j = m; 
        while (i > 0 && j > 0) 
        { 
            // If current character in X[] and Y are same, then 
            // current character is part of LCS 
            if (str.charAt(i-1) == str1.charAt(j-1)) 
            { 
                // Put current character in result 
                lcs[index-1] = str.charAt(i-1);  
                  
                // reduce values of i, j and index 
                i--;  
                j--;  
                index--;      
            } 
   
            // If not same, then find the larger of two and 
            // go in the direction of larger value 
            else if (res[i-1][j] > res[i][j-1]) 
                i--; 
            else
                j--; 
        } 
   
        // Print the lcs 
        // System.out.print("LCS of "+X+" and "+Y+" is "); 
        for(int k=0;k<=temp;k++) 
            System.out.print(lcs[k]);
        // System.out.println(rest);
    }
}