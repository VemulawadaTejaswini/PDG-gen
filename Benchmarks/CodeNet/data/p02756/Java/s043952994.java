import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Integer q = sc.nextInt();
        Integer rev = 0;
        for(int i=0;i<q;i++){
            Integer t = sc.nextInt();
            if(t==1){// 反転
                rev = (rev+1)%2;
            }
            else{// 追加
                Integer f = sc.nextInt();
                String c = sc.next();
                if(rev==1){//反転中
                    if(f==2){// 先頭にc
                        s = c+s;
                    }
                    else{// 末尾にc
                        s = s+c;
                    }
                }
                else{
                    if(f==1){// 先頭にc
                        s = c+s;
                    }
                    else{// 末尾にc
                        s = s+c;
                    }
                }
            }
        }

        if(rev==1){
            String[] ss = s.split("");
            Integer snum = s.length();
            for(int i=0;i<snum;i++){
                System.out.print(ss[snum-i-1]);
            }
        }
        else{
            System.out.print(s);
        }

    }
}
