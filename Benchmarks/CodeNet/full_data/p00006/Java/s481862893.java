import java.io.*;
import java.util.*;

 class Solution {

    public static void main(String[] args) {
        
        Scanner inp =new Scanner(System.in);
        System.out.println(revstr(inp.next()));
        
    }
    
    static String revstr(String input){
        char[] arr=input.toCharArray();
        StringBuffer s=new StringBuffer();
        for(int i=arr.length-1;i>=0;i--){
            s.append(arr[i]);
            
        }
        return s.toString();
    }
}