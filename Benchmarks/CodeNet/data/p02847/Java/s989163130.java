/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SakumaYujin
 */
import java.util.*;
class NewClass {
    public static void main(String[] args){
        String weeksday[]={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        Scanner sc = new Scanner(System.in);
        
        String todays=sc.next();
        int i=0;
        int result=0;
        if(todays=="SUN"){
            result=7;
        }else {
            while(todays!=weeksday[i]){
                i++;
            }
            result=7-i-1;
        }
        System.out.print(result);
       
        
        
        
    }
}
