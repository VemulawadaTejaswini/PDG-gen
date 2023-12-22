import java.io.*;
import java.io.BufferedReader;

public class Main{
    public static String replaceS(String s, int begin, int end){
        String newString = s.substring(0,begin) + s.substring(end);
        return newString;
    }
    public static void main(String[] args){
        String s1,s2;

        //final String FILENAME  = "btest.txt";
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            String curr;
            while(!(curr=br.readLine()).equals(".")){
                s1 = curr;
                //System.out.println(s1+" and \""+s1.indexOf('\"'));
                curr = br.readLine();
                s2 = curr;
                //System.out.println(s2);
                if (s1.equals(s2)){
                    System.out.println("IDENTICAL");
                }else{
                    int[] list1 = new int[100];
                    int[] list2 = new int[100];
                    int x = 0;
                    int y = 0;
                    for (int i = 0; i < s1.length(); i++){
                        if (s1.charAt(i) == '\"'){
                            list1[x] = i;
                            //System.out.println("list1["+x+"]:"+i);
                            x++;     
                        }
                    }
                    for (int i = 0; i < s2.length(); i++){
                        if (s2.charAt(i) == '\"'){
                            list2[y] = i;
                            //System.out.println("list2["+y+"]:"+i);
                            y++;     
                        }
                    }

                    if (list1.length != list2.length){
                        System.out.println("DIFFERENT");
                    }else {
                        int check = 0;
                        for (int i = 0; i < list1.length;i+=2){
                            String temp1 = replaceS(s1,list1[i],list1[i+1]);
                            String temp2 = replaceS(s2,list2[i],list2[i+1]);
                            //System.out.println("temp1:"+temp1);
                            //System.out.println("temp2:"+temp2);
                            if (temp1.equals(temp2)){
                                check = 1;
                                break;
                            }
                        }
                        if (check == 1){
                            System.out.println("CLOSE");
                        }else{
                            System.out.println("DIFFERENT");
                        }
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
