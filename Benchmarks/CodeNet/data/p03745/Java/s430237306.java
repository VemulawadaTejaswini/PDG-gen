
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception{
        BufferedReader bff=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wff=new PrintWriter(System.out);
        bff.readLine();
        String[] st=bff.readLine().split(" ");
        int no=-1;
        int last=-1;
        int res=0;
        for(int i=0;i<st.length;i++){
            int k=Integer.parseInt(st[i]);
            if(last==-1){
                last=k;
            }
            else{
                if(no==-1){
                    if(last-k>0){
                        no=1;
                    }
                    else{
                        no=2;
                    }
                }
                else{
                    if(no==1){
                        if(last-k<=0){
                            no=-1;
                            res++;
                            if(i+1==st.length){
                                res++;
                            }
                        }
                    }
                    else{
                        if(last-k>0){
                            no=-1;
                            res++;
                            if(i+1==st.length){
                                res++;
                            }
                        }
                    }
                }
                last=k;
            }
        }
        if(no!=-1){
            res++;
        }
        wff.println(res);
        wff.flush();
        
    }
}
