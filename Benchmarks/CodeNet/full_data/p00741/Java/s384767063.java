
import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int cnt = 0;
            int reg = 0;
            if(w==0 && h==0)
            {
                break;
            }
            //?????????
            int c[][]=new int[h][w];
            for(int i=0; i<h; i++)
            {
                for(int j=0; j<w; j++)
                {
                    c[i][j] = sc.nextInt();
                }
            }
            //??°???????§?
            for(int i=0; i<h; i++)
            {
                for(int j=0; j<w; j++)
                {
                    if(c[i][j]==1)
                    {
                        cnt++;
                        c[i][j]=cnt+1;
                        if(i<h-1 && j>0)
                        {
                            if(c[i+1][j-1]>1)
                            {
                                c[i][j]=c[i+1][j-1];
                                cnt--;
                            }
                        }

                    }
                    if(c[i][j]>0)
                    {
                        if(i<h-1 && j<w-1)
                        {
                            if(c[i+1][j+1]==1)
                            {
                                c[i+1][j+1]=c[i][j];
                            }
                            if(c[i][j]<c[i+1][j+1])
                            {
                                c[i+1][j+1]=c[i][j];
                                reg++;
                            }
                        }
                        if(i<h-1 && j>0)
                        {
                            if(c[i+1][j-1]==1)
                            {
                                c[i+1][j-1]=c[i][j];
                            }
                            if(c[i][j]<c[i+1][j-1])
                            {
                                c[i+1][j-1]=c[i][j];
                                reg++;
                            }
                        }
                        if(i<h-1)
                        {
                            if(c[i+1][j]==1)
                            {
                                c[i+1][j]=c[i][j];
                            }
                            if(c[i][j]<c[i+1][j])
                            {
                                c[i+1][j]=c[i][j];
                                reg++;
                            }
                        }
                        if(j<w-1)
                        {
                            if(c[i][j+1]==1)
                            {
                                c[i][j+1]=c[i][j];
                            }
                            if(c[i][j]<c[i][j+1])
                            {
                                c[i][j+1]=c[i][j];
                                reg++;
                            }
                        }

                    }
                }
            }
            System.out.println(cnt-reg);
        }
        sc.close();
    }
}