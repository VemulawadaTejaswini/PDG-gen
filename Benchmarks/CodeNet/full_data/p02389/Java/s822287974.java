<?php
	$line = fgets(STDIN);
	$param = sscanf($line, "%d %d");
	echo ($param[0] * $param[1]). " ". (2 * ($param[0] + $param[1])). "\n";