import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.util.*;
class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] arr = new int[s.length];

            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(s[i]);
            }
            boolean flag = false;
            for(int i = 0; i < arr.length; i++){
                for(int j = i + 1; j < arr.length; j++){

                    while (arr[i] != arr[j]){
                        if(arr[i] > arr[j]){
                            arr[i] = arr[i] - arr[j];
                        }else{
                            arr[j] = arr[j] - arr[i];
                        }
                    }

                    if(arr[i] != 1){
                        flag = true;
                    }

                    if(flag) break;

                }
                if(flag) break;
            }
            
            if(flag){
                int ans = GCD(arr[0], arr[1]);
                for(int i = 2; i < arr.length; i++){
                    int new_ans = GCD(ans, arr[i]);
                    if(new_ans != 1){
                        System.out.print("not coprime");
                        break;
                    }
                    ans = new_ans;
                    if(i == arr.length - 1){
                        System.out.print("setwise coprime");
                    }
                }                

            }else{
                System.out.print("pairwise coprime");
            }

        }

        public static int GCD(int a, int b){
            while(a != b){
                if(a > b){
                    a -= b;
                }else{
                    b -= a;
                }
            }
            return a;
        }

}