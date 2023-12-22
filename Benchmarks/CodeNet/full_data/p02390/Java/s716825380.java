public class Time
{
    public String whatTime(int seconds)
    {
	if(seconds == 0)
	    {
		return "0:0:0";
	    }

	int sec = seconds % 60;
	int min =(seconds/60) % 60;
	int hour = (seconds / 3600 ) & 3600;

	return String.format("%d:%d:%d" , hour, min, sec);
    }
}