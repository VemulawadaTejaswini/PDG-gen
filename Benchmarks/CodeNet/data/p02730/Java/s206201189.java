import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    List<Character> list = new ArrayList<>();
    List<Character> list2 = new ArrayList<>();
    List<Character> list3 = new ArrayList<>();
    List<Character> list4 = new ArrayList<>();
    List<Character> list5 = new ArrayList<>();
    List<Character> list6 = new ArrayList<>();

    int count = 0;

    for(int i = 0; i < s.length(); i++){
        list.add(s.charAt(i));

        //切り出した文字列を一文字ずつ出力
    }

    for(int i = 0; i < list.size(); i++){
        list2.add(list.get(i));
    }

    Collections.reverse(list);
    if(list == list2){
    }else{count++;}

    for(int i = 0; i < (s.length()-1)/2; i++){
        list3.add(list.get(i));
    }
    
    for(int i = 0; i < list3.size(); i++){
        list4.add(list3.get(i));
    }

    Collections.reverse(list3);

    if(list3 == list4){
    }else{count++;}

    for(int i = s.length(); i > (s.length()+1)/2; i--){
        list5.add(list.get(i-1));
    }
    
    for(int i = 0; i < list5.size(); i++){
        list6.add(list5.get(i));
    }

    Collections.reverse(list5);
    if(list5 == list6){
    }else{count++;}

    if(count == 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    

    
    
    
	}
}