import java.util.Scanner;
  
class Main{
  public static void main(String[] arg){
    int n, m, l;
    int [][] a,b;
    long [][] c;
 
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    m = in.nextInt();
    l = in.nextInt();

    a = new int[n][m];
    b = new int[m][l];
    c = new long[n][l];

    for(int i=0; i<a.length; i++){
        in.nextLine();
        for(int j=0; j<a[0].length; j++)
            a[i][j] = in.nextInt();
    }

    for(int i=0; i<b.length; i++){
        in.nextLine();
        for(int j=0; j<b[0].length; j++)
            b[i][j] = in.nextInt();
    }

    for(int i=0; i<c.length; i++)
        for(int j=0; j<c[0].length; j++)
            c[i][j] = 0;

    for(int i=0; i<n; i++)
        for(int j=0; j<l; j++)
            for(int k=0; k<m; k++)
                c[i][j] += a[i][k]*b[k][j];
 
    for(int i=0,j; i<c.length; i++){
        for(j=0; j<c[0].length-1; j++)
            System.out.print(c[i][j] + " ");
        System.out.println(c[i][j]);
    }
 
  }
}