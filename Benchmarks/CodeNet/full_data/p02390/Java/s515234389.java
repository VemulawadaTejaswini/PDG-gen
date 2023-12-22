import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan_ = new Scanner(System.in);
        int hours_    = 0;
        int minutes_  = 0;
        int secconds_ = 0;
        int totalSecconds_ = scan_.nextInt();
        
         hours_ = totalSecconds_ / 3600;
         totalSecconds_ -= hours_ * 3600;
         minutes_ = totalSecconds_ / 60;
         totalSecconds_ -= minutes_ * 60;
         secconds_ = totalSecconds_;
         System.out.println(hours_ + ":" + minutes_ + ":" + secconds_);
    }
}
