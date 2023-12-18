
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] ans = sc.nextLine().toCharArray();
        final char[][] init = {
            {'S', 'S'}, {'S', 'W'}, {'W', 'S'}, {'W', 'W'}
        };
        for(char[] initSet:init){
            char[] animals = new char[n];
            animals[0]=initSet[0];
            animals[1]=initSet[1];
            if(animals[0]=='S'){
                animals[n-1] = (ans[0]=='o')? animals[1] : revAnimal(animals[1]);
            }else{
                animals[n-1] = (ans[0]=='o')? revAnimal(animals[1]) : animals[1];
            }

            for(int i=1;i<n-2;i++){
                if(animals[i]=='S'){
                    animals[i+1] = (ans[i]=='o')? animals[i-1] : revAnimal(animals[i-1]);
                }else{
                    animals[i+1] = (ans[i]=='o')? revAnimal(animals[i-1]) : animals[i-1];
                }
                animals[i+1] = nextAnimal(animals[i], animals[i-1], ans[i]);
            }
            boolean can;
            char constrain = nextAnimal(animals[n-2], animals[n-3], ans[n-2]);
            if(constrain==animals[n-1]){
                String str = new StringBuilder().append(animals).toString();
                System.out.println(str);
            }else{
                continue;
            }
        }
        System.out.println(-1);
    }
    public static char revAnimal(char animal){
        if(animal=='S'){
            return 'W';
        }else{
            return 'S';
        }
    }

    public static char nextAnimal(char animal, char prevAnimal, char ans){
        char next;
        if(animal=='S'){
            next = (ans=='o')? prevAnimal : revAnimal(prevAnimal);
        }else{
            next = (ans=='o')? revAnimal(prevAnimal) : prevAnimal;
        }
        return next;
    }
}