import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args){
        int n,h = 0;
        int[] a = null;
        int[] b = null;
        boolean flg = true;
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String[] temp = s.split(" ");
            n = Integer.parseInt(temp[0]);
            h = Integer.parseInt(temp[1]);
            a = new int[n];
            b = new int[n];
            for(int i=0;i<n;i++){
                s = reader.readLine();
                temp = s.split(" ");
                a[i] = Integer.parseInt(temp[0]);
                b[i] = Integer.parseInt(temp[1]);
            }
        } catch (IOException e){}
        int c = 0;
        while(flg){
            int aIndex = Max(a);
            int bIndex = Max(b);
            if(a[aIndex] >= b[bIndex]){
                if(h % a[aIndex] == 0 ){
                    System.out.println("" + c + h / a[aIndex]);
                    break;
                } else{
                    System.out.println("" + c + h / a[aIndex] + 1);
                    break;
                }
            }
            else{
                if(a[bIndex] < a[aIndex]){
                    h -= b[bIndex];
                    c++;
                    b[bIndex] = 0;
                    a[bIndex] = 0;
                } else{
                    if(h <= b[bIndex]){
                        h -= b[bIndex];
                        c++;
                    } else{
                        int j = second(b);
                        if(j == -1){
                            h -= a[aIndex];
                            c++;
                        }
                        else if(a[aIndex] >= b[j]){
                            h -= a[aIndex];
                            c++;
                        }else{
                            h -= b[j];
                            c++;
                            b[j] = 0;
                            a[j] = 0;
                        }
                    }
                }
                if(h <= 0){
                    System.out.println("" + c);
                    break;
                }
            }
        }
    }
    public static int Max(int[] a){
        int max = 0;
        int index = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
                index = i;
            }
        }
        return index;
    }
    public static int second(int[] a){
        int max = a[0];
        int second = 0;
        int index = 0;
        int j = 0;
        for(int i=1;i<a.length;i++){
            if(a[i] >= max){
                second = max;
                max = a[i];
                j = index;
                index = i;
            }else{
                if(a[i] > second){
                    second = a[i];
                    j = i;
                }
            }
        }
        if(index == j){
            return -1;
        }
        return j;
    }
}