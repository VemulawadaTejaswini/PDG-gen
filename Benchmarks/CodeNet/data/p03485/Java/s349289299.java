

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean isTrue(ArrayList<Integer> a,int goal){
        int s = 16001;
        int[][] table = new int[a.size()+1][s];
        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[0].length; j++){
                table[i][j] = 0;
            }
        }
        table[0][s/2] = 1;
        for(int i=0; i<table.length-1; i++){
            for(int j=0; j<table[0].length; j++){
                if(table[i][j] == 1){
                    table[i+1][j+a.get(i)] = 1;
                    table[i+1][j-a.get(i)] = 1;
                }
            }
        }
        if(table[table.length-1][goal+s/2] == 1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        String[] s = br.readLine().trim().split("");
        int[] arr = inputval();
        int finalx = arr[0];
        int finaly = arr[1];
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        int flag = 1;
        int count = 0;
        for(int i=0; i<s.length; i++){
            if(s[i].equals("T")){
                if(flag ==1){
                    x.add(count);
                }else{
                    y.add(count);
                }
                flag = -flag;
                count = 0;
            }else{
                count++;
                if(i == s.length-1){
                    if(flag ==1){
                        x.add(count);
                    }else{
                        y.add(count);
                    }
                }
            }
        }
        if(isTrue(x,finalx) && isTrue(y,finaly)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}