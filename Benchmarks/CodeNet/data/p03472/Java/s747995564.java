import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args){
        int n,h = 0;
        int[] a = null;
        int[] b = null;
        boolean flg = true;
        Index index = new Index();
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
            Index value = index.calc(a);
            Index value2 = index.calc(b);
            int aIndex = value.first;
            int bIndex = value2.first;
            int j = value2.second;
            if(j == -1){
                if(a[aIndex] > b[bIndex]){
                    if(h % a[aIndex] == 0){
                        c += h / a[aIndex];
                    } else{
                        c += h / a[aIndex] + 1;
                    }
                } else{
                    h -= b[bIndex];
                    c++;
                    if(h > 0){
                        if(h % a[aIndex] == 0){
                            c += h / a[aIndex];
                        } else{
                         c += h / a[aIndex] + 1;
                        }
                    }
                }
                System.out.println("" + c);
                break;
            }
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
                        if(a[aIndex] >= b[j]){
                            if(a[aIndex] == b[j] && aIndex != j){
                                h -= b[j];
                                c++;
                                b[j] = 0;
                                a[j] = 0;
                            }else{
                                h -= a[aIndex];
                                c++;
                            }
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
    
}
class Index {
    int first;
    int second;

    public Index calc(int[] a){
        Index index = new Index();
        int max = a[0];
        int second = 0;
        int k = 0;
        int j = 0;
        for(int i=1;i<a.length;i++){
            if(a[i] >= max){
                second = max;
                max = a[i];
                j = k;
                k = i;
            }else{
                if(a[i] > second){
                    second = a[i];
                    j = i;
                }
            }
        }
        if(k == j || a[j] == 0){
            index.first = k;
            index.second = -1;
            return index;
        }
        index.first = k;
        index.second = j;
        return index;
    }
}
