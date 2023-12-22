package javaTest;

import org.apache.commons.lang.StringUtils;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Lenovo on 2017/6/30.
 */
public class Algorithm {
    public static void main(String[] args){
//        int n = 7;
//        int list[] = {5,3,1,3,4,2,6};
//        int result = getMax(n,list);
//        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        String[] expr = scanner.nextLine().split(" ");
        LinkedList<Integer> stack = new LinkedList<>();
        for(String str : expr){
            if(str.equals("+") ||str.equals("-") || str.equals("*")){
                int temp,num1 = stack.pop(),num2 = stack.pop();
                switch (str){
                    case "+": temp = num1+num2;
                        break;
                    case "-": temp = num2 - num1;
                        break;
                    default:temp = num1*num2;
                        break;
                }
                stack.push(temp);
            }else{
                stack.push(Integer.valueOf(str));
            }
        }
        System.out.println(stack.pop());
        
    }

//    private static int getMax(int n, int[] list) {
//        int max = Integer.MIN_VALUE, left = 0;
//
//        for(int i = 1; i < n; i++){
//            System.out.println(max);
//            max =  Integer.max(max, list[i] - list[left]);
//            if(list[i] < list[left])
//                left = i;
//        }
//
//        return max;
//    }
}