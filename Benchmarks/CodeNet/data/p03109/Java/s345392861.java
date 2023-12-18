import java.util.Scanner;

String tbd= "TBD";
String heisei = "Heisei";

Scanner inputDate = new Scanner(System.in);
String[] splitDate = inputDate.split("/", 0);

int year = Integer.parseInt(splitDate[0]);
int month = Integer.parseInt(splitDate[1]);
int day = Integer.parseInt(splitDate[2]);

if(year <= 2018) return heisei;
else if(year == 2019 && month <= 4) return heisei;
else return tbd;
 