/*
 *           AUTHOR: Maria Theresa M. Padayhag
 *             DATE: 20160326
 *  PRE-REQUIREMENT: JDK 1.8
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

class DayIndentifier
{
	LocalDate date = null;
	
	public 	DayIndentifier( String inMonth, String inDay )
	{
		// NumberFormatException might be thrown here
		// but it will be handled by the caller.
		int month = Integer.parseInt( inMonth );
		int day   = Integer.parseInt( inDay );
		
		// DateTimeException might be thrown here
		// but it will be handled by the caller.
		date = LocalDate.of( 2004, month, day );
	}
	
	public String getDayOfWeek()
	{
		// NullPointerException might be thrown here
		// but it will handled by the caller.
		return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	}
}

public class Main
{
	public static boolean toExit( String[] dataset )
	{
		for(String data: dataset)
		{
			if(data.equals("0"))
				return true;
		}
		
		return false;
	}
	
	public static void main( String args[] ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input;
		String dataset[];
		DayIndentifier di;
		
		READ: 
		while( ( input = br.readLine() ) != null ) {
			try {
				dataset = input.split(" ");
			
				if( toExit( dataset ) ) {
					break READ;
				}
				
				if( dataset.length != 2 ) {
					System.out.println("Invalid input.");
					continue READ;
				} 		
				
				di = new DayIndentifier(dataset[0], dataset[1]);
				System.out.println( di.getDayOfWeek() );
			} catch( Exception e ) {
				System.out.println("Invalid input.");
				continue READ;
			}		
		}
	}
}