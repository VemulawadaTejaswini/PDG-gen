import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int q = Integer.parseInt(input.readLine());
        StringBuffer sb = new StringBuffer(s);
        boolean rvflag = false;

        for(int i=0;i<q;i++){
            String[] qn = input.readLine().split(" ");
            if(qn.length == 1){
                if(rvflag){
                    rvflag = false;
                }else{
                    rvflag = true;
                }
            }else{
                if(qn[1].equals("1")){
                    if(rvflag){
                        sb.append(new StringBuffer(qn[2]).reverse());
                    }else{
                        sb.insert(0,qn[2]);
                    }
                }else if(qn[1].equals("2")){
                    if(rvflag){
                        sb.insert(0,new StringBuffer(qn[2]).reverse());
                    }else{
                        sb.append(qn[2]);
                    }
                }
            }
        
        
        }
        if(rvflag){
            sb.reverse();
        }
        System.out.println(sb.toString());
    }
}
