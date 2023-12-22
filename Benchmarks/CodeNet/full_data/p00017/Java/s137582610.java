import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int key=0;
        boolean last=false;
        loop:
        for(int i=0;i<str.length;i++){
            if(str[i].length()==3||str[i].length()==4){
                char[] cha = str[i].toCharArray();
                int[] c = new int[cha.length];
                for(int j=0;j<cha.length;j++){
                    if(cha[j]=='.'){
                        last=true;
                        c[j]=-1;
                        continue;
                    }
                    c[j]=(int)(cha[j]-'a');
                }
                int[] d= new int[cha.length];
                for(int j=0;j<cha.length;j++){
                    d[j]=c[j];
                }
                for(int j=1;j<26;j++){
                    for(int q=0;q<cha.length;q++){
                        c[q]=d[q];
                    }
                    String douda ="";
                    for(int k=0;k<cha.length;k++){
                        if(c[k]==-1){
                            continue;
                        }else if(c[k]+j>25){
                            c[k]+=j-26;
                        }else{
                            c[k]+=j;
                        }
                        douda+=String.valueOf((char)(c[k]+'a'));
                        //System.out.println(douda+" "+c[0]);
                    }
                    if(douda.equals("the")||douda.equals("that")||douda.equals("this")){
                        key=j;
                        break loop;
                    }
                }
            }
        }
        loop2:
        for(int i=0;i<str.length;i++){
            char[] cha = str[i].toCharArray();
            int[] c = new int[cha.length];
            for(int j=0;j<cha.length;j++){
                c[j]=(int)(cha[j]-'a');
            }
                
            String douda ="";
            boolean fin = false;
            for(int k=0;k<cha.length;k++){
                if(c[k]==(int)('.'-'a')){
                    fin=true;
                    break;
                }
                if(c[k]+key>25){
                    c[k]+=key-26;
                }else{
                    c[k]+=key;
                }
                douda+=String.valueOf((char)(c[k]+'a'));
            }
            System.out.print(douda);
            if(fin){
                System.out.println(".");
                break;
            }
            System.out.print(" ");
        }
        
    }
}