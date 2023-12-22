import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if(year < 1868 || (year == 1868 && month <= 8) || (year == 1868 && month == 9 && day < 8)){
                System.out.println("pre-meiji");
            }else if(year < 1912 || (year == 1912 && month < 7) || (year == 1912 && month == 7 && day <= 29)){
                System.out.println("meiji " + (year - 1867) + " "+ month + " " +  day);
            }else if(year < 1926 || (year == 1926 && month < 12) || (year == 1926 && month == 12 && day <= 24)){
                System.out.println("taisho " + (year - 1911) + " "+ month + " " +  day);
            }else if(year < 1989 || (year == 1989 && month == 1 && day <= 7)){
                System.out.println("showa " + (year - 1925) + " "+ month + " " +  day);    
            }else{
                System.out.println("heisei " + (year - 1988) + " "+ month + " " +  day); 
            }
        }
    }
}
