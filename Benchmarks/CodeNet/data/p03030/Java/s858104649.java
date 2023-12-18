import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 9080384
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> rest_list = new ArrayList<String>();
        int rest_num = sc.nextInt();
        StringBuilder sb;
        for (int i = 0; i < rest_num; i++) {
            sb = new StringBuilder();
            sb.append(sc.next());
            sb.append(-1*sc.nextInt()+100);
            sb.append("_");
            sb.append(i+1);
            rest_list.add(sb.toString());
        }
        Collections.sort(rest_list);
        
        for(String obj : rest_list) {
            System.out.println(obj.split("_")[1]);
        }
    }
}
