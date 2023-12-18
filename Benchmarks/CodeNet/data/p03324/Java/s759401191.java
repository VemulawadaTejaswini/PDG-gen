import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int D = sc.nextInt();
                int N = sc.nextInt();
                int count = 0;
                if(D == 0){
                        System.out.println(N);
                }else{
                        for(int i=1; ;i++){
                                if(i % Math.pow(100,D) == 0){
                                        count ++;
                                        if(count == N){
                                                System.out.println(i);
                                                break;
                                        }
                                }
                        }
                }
        }
}
