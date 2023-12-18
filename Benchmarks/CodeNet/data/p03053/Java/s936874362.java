import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
    static int h = sc.nextInt();
    static int w = sc.nextInt();
    public static void main(String[] args) {
        char[][] a = new char[h][w];
        int ans = 0;
        String tmp;
        for(int i = 0; i < h; i++){
            tmp = sc.next();
            a[i] = tmp.toCharArray();
        }
        while(true){
            char[][] copy2 = new char[h][w];
            for(int i = 0; i < h; i++){
                for(int l = 0; l < w; l++){
                    if(a[i][l]=='#'){
                        copy2[i][l]='#';
                        if(i!=0)copy2[i-1][l]='#';
                        if(i!=h-1)copy2[i+1][l]='#';
                        if(l!=0)copy2[i][l-1]='#';
                        if(l!=w-1)copy2[i][l+1]='#';
                    }else{
                        if(copy2[i][l]=='\0'){
                            copy2[i][l]='.';
                        }
                    }
                }
            }
            ans++;
             
            /*
            System.out.println();
            for(int i = 0; i < h; i++){
                System.out.println(copy2[i]);
            }
            System.out.println();
            */
            if(check(copy2))break;
            a=copy2.clone();
        }
        System.out.println(ans);

    }

    static boolean check(char[][] a){
        for(int i = 0; i < h; i++){
            for(int l = 0; l < w; l++){
                if(a[l][i]=='.')return false;
            }
        }
        return true;
    }

}
