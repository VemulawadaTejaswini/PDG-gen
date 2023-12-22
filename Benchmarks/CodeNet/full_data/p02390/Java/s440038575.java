
import java.io.*;
class main
{
private static String main(long startTime, long endTime) {

    String diffTime = DurationFormatUtils.formatPeriod(startTime,
            endTime, "HH:mm:ss.SSS");

    return diffTime;


}
           }