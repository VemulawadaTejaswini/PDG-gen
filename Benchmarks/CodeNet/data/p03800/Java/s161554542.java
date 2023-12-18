import java.util.Scanner;

/**
 * Created by liguoxiang on 2017/02/18.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        String b = sc.next();
        if(a<=0){
            System.out.println(-1);
            return;
        }

        char[] words=new char[a];

        char[] zoo=new char[a];

        for(int i=0;i<a;i++){
            words[i]=b.charAt(i);

        }

        Main sol=new Main();
        if(sol.helper(zoo,0,words)){
            String res="";
            for(char ch:zoo){
                res+=ch;
            }
            System.out.println(res);

        }else{
            System.out.println(-1);
        }



    }

    public boolean helper(char[] zoo, int i,char[] status){


        if(zoo[i]=='W' || zoo[i]=='S'){

            for(int j=0;j<zoo.length;j++){

                int pre=j-1;
                int next=j+1;
                if(j==0){
                    pre=zoo.length-1;
                }

                if(j==zoo.length-1){
                    next=0;
                }

                if(zoo[j]=='S'){
                    if(((zoo[pre]=='S' && zoo[next]=='S') || (zoo[pre]=='W' && zoo[next]=='W')) ){
                        if(status[j]!='o'){
                            return false;
                        }

                    }else{
                        if(status[j]!='x'){
                            return false;
                        }

                    }

                }else if(zoo[j]=='W'){
                    if(((zoo[pre]=='S' && zoo[next]=='S') || (zoo[pre]=='W' && zoo[next]=='W')) ){
                        if(status[j]!='x') {
                            return false;
                        }
                    }else{
                        if(status[j]!='o'){
                            return false;
                        }
                    }
                }

            }
            return true;
        }

        zoo[i]='S';
        if(helper(zoo,(i+1)%zoo.length,status)){
           return true;
        }else{
            zoo[i]='W';
            if(helper(zoo,(i+1)%zoo.length,status)){
                return true;
            }else{
                zoo[i]=' ';
                return false;
            }
        }

    }

}