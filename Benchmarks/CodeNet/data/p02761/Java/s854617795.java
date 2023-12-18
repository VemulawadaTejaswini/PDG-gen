import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = input.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] s = new String[m];
        String[] c = new String[m];
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        List<String> one = new ArrayList<String>();
        List<String> two = new ArrayList<String>();
        List<String> three = new ArrayList<String>();
        String ans = "";

        boolean flag = true;
        for(int i=0;i<m;i++){
            String[] sc = input.readLine().split(" ");
            s[i] = sc[0];
            c[i] = sc[1];            
        }
        for(int i=0;i<m;i++){
            if(n != 1 && s[i].equals("1")&& c[i].equals("0")){
                flag = false;
            }
        }
        for(int i=0;i<m;i++){
            if(s[i].equals("1")){
                countOne++;
                one.add(c[i]);
            }
            if(s[i].equals("2")){
                countTwo++;
                two.add(c[i]);
            }
            if(s[i].equals("3")){
                countThree++;
                three.add(c[i]);
            }
        }
        if(countOne>1){
            List<String> del = one.stream().distinct().collect(Collectors.toList());
            if(del.size()!=1){
                flag = false;
            }
        }
        if(countTwo>1){
            List<String> del = one.stream().distinct().collect(Collectors.toList());
            if(del.size()!=1){
                flag = false;
            }
        }
        if(countThree>1){
            List<String> del = one.stream().distinct().collect(Collectors.toList());
            if(del.size()!=1){
                flag = false;
            }
        }
        if(flag == false){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<m;i++){
            if(s[i].equals("1")){
                ans = c[i];                
            }else{
                if(i==m-1){
                    if(n!=1){
                        ans = "1";
                    }else{
                        ans = "0";
                    }
            }
        }
        }
        for(int i=0;i<m;i++){
            if(ans.length()==1){
            if(s[i].equals("2")){
                ans = ans + c[i];                
            }else{
                if(i==m-1){
                ans = ans + "0";
            }
        }
        }
        }
        for(int i=0;i<m;i++){
            if(ans.length()==2){
            if(s[i].equals("3")){
                ans = ans + c[i];                
            }else{
                if(i==m-1){
                ans = ans + "0";
            }
            }

        }
        }
        System.out.println(ans);
    }
}

